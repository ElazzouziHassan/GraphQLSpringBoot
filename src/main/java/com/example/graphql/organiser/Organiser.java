package com.example.graphql.organiser;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import com.example.graphql.event.Event;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Organiser {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "organiser")
  private List<Event> events;

  public record OrganiserInput(
          String name
  ) {
  }
}
