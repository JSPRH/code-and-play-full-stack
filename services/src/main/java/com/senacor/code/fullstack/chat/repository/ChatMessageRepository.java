package com.senacor.code.fullstack.chat.repository;

import com.senacor.code.fullstack.chat.domain.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data repository for the chat messages.
 */
public interface ChatMessageRepository extends MongoRepository<ChatMessage, String> {

}