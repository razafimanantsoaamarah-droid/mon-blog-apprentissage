package com.mekill404.expense_tracker.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import lombok.Builder;

@Entity @Builder
@Table(name="Income")
public class Income extends Transaction{
}
