package com.example.webfluxcrud;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Data
@Document(value="student")
public class Student {

  @Id
  private Long idx;
  private String id;
  private String firstName;
  private String lastName;

  @Builder
  public Student(Long idx, String id, String firstName, String lastName) {
    this.idx = idx;
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }
}