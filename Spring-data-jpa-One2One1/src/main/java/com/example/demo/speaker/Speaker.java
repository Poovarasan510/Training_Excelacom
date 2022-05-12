package com.example.demo.speaker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="flowerspeaker_oneToOne")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Speaker {

@Id
@Column(name="speaker_id")
int id;

@Column(name="speaker_name",length=40,nullable=false)
String firstName;

@Column(name="speaker_qualification")
String qualification;



}