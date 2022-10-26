package com.example.examenpractico.services.Impl;

import com.example.examenpractico.model.Client;
import com.example.examenpractico.services.ClientService;

import java.util.ArrayList;

public class ClientServiceImpl implements ClientService {
    ArrayList<Client> Clients = new ArrayList<>();
    @Override
    public boolean createClient(String id, String username, String phone, String email, String address, Integer age) {
        try {

        }catch (Exception e) {}
        Clients.add(new Client(id, username, phone, email, address, age));
        return true;
    }

    @Override
    public Client searchClient(String name) {
        for (Client client : Clients) {
            if (client.getUsername().equals(name) && client.getAge()>=18) {
                return client;
            }
        }return null;
    }

    @Override
    public void listClients() {

    }

}
