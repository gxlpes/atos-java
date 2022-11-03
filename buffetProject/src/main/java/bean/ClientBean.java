package bean;

import dao.ClientDAO;
import entity.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean(name = "clientBean")
@RequestScoped
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ClientBean {
    static Client clientBeanx;
    static List listBean;

    private String cpf;

    public static void getData(Client client) {
        clientBeanx = client;
    }

    public static void getAllData(List all) {
        listBean = all;
    }

    public String getCPF() {
        return clientBeanx.getId();
    }

    public String getClient() {
        return clientBeanx.getClient();
    }

    public String getDesert() {
        return clientBeanx.getDesert();
    }

    public Integer getGuests() {
        return clientBeanx.getGuests();
    }

    public double getPriceGuest() {
        return clientBeanx.getPriceGuest();
    }

    public double getPriceGuests() {
        return clientBeanx.getPriceGuests();
    }

    public int getWaiters() {
        return clientBeanx.getWaiters();
    }

    public double getPriceWaiters() {
        return clientBeanx.getPriceWaiters();
    }

    public double getPriceTotal() {
        return clientBeanx.getPriceTotal();
    }

    public List getTableAll() {
        return ClientDAO.searchAll();
    }

    public Integer getResult(String id) {
        return ClientDAO.getResult(id);
    }
}

