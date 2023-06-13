package DTO;

import java.util.List;



public class AllClientsDTO {
    private List<ClientResponseDTO> clients;

    public AllClientsDTO(List<ClientResponseDTO> clients) {
        this.clients = clients;
    }

    public List<ClientResponseDTO> getClients() {
        return clients;
    }
    public static AllClientsBuilder builder(){return new AllClientsBuilder();}
    public void setClients(List<ClientResponseDTO> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "AllClientsDTO "+ this.getClients();
    }
    public static class AllClientsBuilder{
        private List<ClientResponseDTO> clients;

        public AllClientsBuilder() {
        }

        public AllClientsBuilder AllClientsBuilder(List<ClientResponseDTO> clients) {
            this.clients = clients;
            return this;
        }

        public AllClientsDTO build(){
            return new AllClientsDTO(this.clients);
        }

        @Override
        public String toString() {
            return "AllClientsBuilder " + this.clients;
        }
    }
}