package com.example.scheduler.services;
import com.example.scheduler.models.DAOUser;
import com.example.scheduler.repositories.DAOUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DAOUserService {
    private DAOUserRepository userRepo;

    @Autowired
    public DAOUserService(DAOUserRepository userRepo) {
        this.userRepo = userRepo;
    }
}
