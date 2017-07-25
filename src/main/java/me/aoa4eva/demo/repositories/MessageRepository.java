package me.aoa4eva.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import me.aoa4eva.demo.models.Message;

public interface MessageRepository extends CrudRepository<Message,Long> {
}
