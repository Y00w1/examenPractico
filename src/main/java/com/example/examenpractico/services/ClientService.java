package com.example.examenpractico.services;

import com.example.examenpractico.model.Client;

public interface ClientService {
    boolean createClient(String id, String username, String phone, String email, String address);
    Client searchClient(String name);
}
