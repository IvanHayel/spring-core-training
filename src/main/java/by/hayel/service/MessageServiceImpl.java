package by.hayel.service;

import by.hayel.repository.MessageRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageServiceImpl implements MessageService {
  MessageRepository messageRepository;

  @Override
  public void printMessage() {
    var message = messageRepository.getMessage();
    System.out.println(message);
  }
}
