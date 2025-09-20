# Parking Lot Management System

## Overview
A comprehensive Parking Lot Management System demonstrating object-oriented design principles and design patterns for SDE2+ level interviews.

## Functional Requirements
- Multi-level parking lot with different vehicle types
- Vehicle parking and retrieval operations
- Spot availability tracking and management
- Payment processing with multiple strategies
- Fee calculation based on vehicle type and duration
- Real-time spot allocation and deallocation

## Design Patterns Implemented
- **Factory Pattern**: VehicleFactory creates different vehicle types
- **Strategy Pattern**: PaymentStrategy for different payment methods
- **Strategy Pattern**: ParkingFeeStrategy for different pricing models
- **Template Method**: Abstract Vehicle class with concrete implementations

## Core Architecture

### Entities
- **ParkingLot**: Main controller managing spots and operations
- **ParkingSpot**: Individual parking space with occupancy tracking
- **Vehicle**: Abstract base class for different vehicle types
- **Payment**: Payment processing with strategy composition
- **VehicleType**: Enum defining supported vehicle categories

### Key Classes
```
ParkingLot.java        - Main parking lot controller
ParkingSpot.java       - Individual spot management
Vehicle.java           - Abstract vehicle with fee strategy
Car.java              - Concrete car implementation
VehicleFactory.java    - Factory for vehicle creation
Payment.java          - Payment processing system
PaymentStrategy.java   - Payment method interface
UpiPayment.java       - UPI payment implementation
VehicleType.java      - Vehicle type enumeration
```

## Features
- **Dynamic Spot Allocation**: Finds available spots by vehicle type
- **Multi-Vehicle Support**: Cars, motorcycles, trucks (extensible)
- **Flexible Payment System**: Multiple payment methods via Strategy pattern
- **Fee Calculation**: Different pricing strategies per vehicle type
- **Occupancy Tracking**: Real-time spot availability monitoring
- **Extensible Design**: Easy to add new vehicle types and payment methods

## Technical Highlights
- Clean separation of concerns with single responsibility principle
- Strategy pattern for flexible payment and pricing
- Factory pattern for object creation
- Abstract classes for code reuse and polymorphism
- Enum-based type safety for vehicle categories

## System Operations
```java
// Create parking lot
ParkingLot lot = new ParkingLot(100);

// Park a vehicle
Vehicle car = VehicleFactory.createVehicle("Car", "ABC123");
ParkingSpot spot = lot.parkVehicle(car);

// Process payment
Payment payment = new Payment(new UpiPayment());
payment.processPayment(calculateFee());

// Vacate spot
lot.vacate(spot);
```

## How to Run
```bash
javac ParkingLot/*.java
java ParkingLot.ParkingLot
```

## Extensibility
- **New Vehicle Types**: Extend Vehicle class and update VehicleFactory
- **Payment Methods**: Implement PaymentStrategy interface
- **Pricing Models**: Implement ParkingFeeStrategy interface
- **Spot Types**: Extend ParkingSpot for specialized spots

## SDE2 Interview Readiness: ✅ GOOD (7.5/10)
Demonstrates solid OOP principles, design patterns, and system design concepts suitable for parking lot design interviews.

## Future Enhancements
- Multi-level parking support
- Reservation system
- Real-time availability API
- Mobile app integration
- Analytics and reporting
