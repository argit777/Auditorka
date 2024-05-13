package com.example.demo.entity;
import com.example.demo.entity.URepository;
import com.example.demo.entity.UService;
import com.example.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UServiceImpl implements UService {
    private final URepository userRepository;

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }
}