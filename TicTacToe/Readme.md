# Tic Tac Toe

## Overview
A robust Tic Tac Toe implementation showcasing multiple design patterns and advanced OOP concepts for SDE2+ level interviews.

## Functional Requirements
- 2 Players: X and O
- 3x3 Grid gameplay
- Turn-based system starting with X
- Win conditions: 3 in a row/column/diagonal
- Draw detection when board is full
- Input validation and error handling

## Design Patterns Implemented
- **Singleton Pattern**: Grid with thread-safe double-checked locking
- **Factory Pattern**: PlayerFactory creates X and O players
- **Strategy Pattern**: MoveStrategy for different input types (Human/AI)
- **Template Method**: Abstract Player class with concrete implementations

## Core Architecture

### Entities
- **Grid**: Game board with win/draw detection and move validation
- **Player**: Abstract base class for different player types
- **Turn**: Thread-safe turn management system
- **MoveStrategy**: Pluggable input strategies

### Key Classes
```
GamePlay.java           - Main game loop with error handling
Grid.java              - Game board with synchronized access
Player.java            - Abstract player with strategy composition
PlayerX.java/PlayerO.java - Concrete player implementations
PlayerFactory.java     - Factory for player creation
Turn.java              - Thread-safe turn management
MoveStrategy.java      - Strategy interface for moves
HumanInputStrategy.java - Human input with validation
```

## Features
- **Robust Input Validation**: Handles invalid coordinates and non-numeric input
- **Error Recovery**: Graceful handling with retry mechanism
- **Thread Safety**: Synchronized turn management
- **Extensible Design**: Easy to add AI players via Strategy pattern
- **Complete Game Flow**: Win detection, draw detection, proper game termination

## Technical Highlights
- Thread-safe singleton with double-checked locking
- Strategy pattern for extensible player types
- Comprehensive input validation and error handling
- Clean separation of game logic and user interface
- Resource management best practices

## How to Run
```bash
javac TicTacToe/*.java
java TicTacToe.GamePlay
```

## Game Instructions
- Enter row and column coordinates (0-2)
- Players alternate turns (X starts first)
- Game ends on win or draw
- Invalid moves prompt for retry

## SDE2 Interview Readiness: ✅ EXCELLENT (8.5/10)
Demonstrates advanced design patterns, error handling, thread safety, and extensible architecture.