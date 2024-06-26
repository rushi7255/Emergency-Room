# Emergency Room Priority Queue
Hello Coders,
This project implements a simple priority queue system for an emergency room using Java. It demonstrates how patients can be managed based on the severity of their condition.

## Overview

The system consists of two main classes:
1. `Patient`: Represents a patient with a name and priority level.
2. `EmergencyRoom`: Manages the priority queue of patients.

## How It Works

- Patients are added to the queue with a name and a priority level (lower number = higher priority).
- The `PriorityQueue` automatically sorts patients based on their priority.
- Patients are treated (removed from the queue) in order of priority.

## Features

Add Patients: Add new patients to the queue with a specified priority.
Treat Patients: Remove and "treat" the highest priority patient.
Display Queue: Show the current state of the patient queue.

## Benefits

Ensures that patients with more severe conditions (higher priority) are treated first.
Provides a simple and efficient way to manage patient flow in an emergency room setting.
