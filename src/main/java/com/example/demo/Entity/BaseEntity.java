package com.example.demo.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
}
