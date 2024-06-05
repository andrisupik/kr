package com.example.tvprogrambackend.repositories;

import com.example.tvprogrambackend.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> { }
