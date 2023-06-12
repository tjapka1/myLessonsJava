package DTO;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
//@Builder
public class AllClientsDTO {
    private List<ClientResponseDTO> clients;

    public AllClientsDTO(List<ClientResponseDTO> clients) {
        this.clients = clients;
    }
    public static AllClientsDTOBuilder builder(){return new AllClientsDTOBuilder();}

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

    @Data
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
