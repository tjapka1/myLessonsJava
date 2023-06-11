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

    public void setClients(List<ClientResponseDTO> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Cients=" +" " + this.clients;
    }

    public static class AllClientsDTOBuilder {
        private List<ClientResponseDTO> clients;

        public AllClientsDTOBuilder() {
        }
        public AllClientsDTOBuilder clients(List<ClientResponseDTO> clients){
            this.clients=clients;
            return this;
        }
        public AllClientsDTO build(){return new AllClientsDTO(this.clients);}
        public String toString() {
            return "AllContacsDTO.AllContacsDTOBuilder(contacts=" + this.clients + ")";
        }
    }
}
