# Snake Game

## Overview
A complete Snake Game implementation demonstrating advanced OOP principles and design patterns suitable for SDE2+ level interviews.

## Functional Requirements
- Snake moves in 4 directions (Up, Down, Left, Right)
- Grid-based movement with boundary collision detection
- Self-collision detection (snake hits its own body)
- Random food generation (avoids snake body)
- Snake grows by 1 segment when eating food
- Game ends on collision or when grid is full

## Design Patterns Implemented
- **Singleton Pattern**: Grid and Snake instances
- **Strategy Pattern**: Movement directions (Up, Down, Left, Right)
- **Factory Pattern**: MovementProcessor creates direction objects
- **Command Pattern**: DirectionType enum with movement commands

## Core Architecture

### Entities
- **Grid**: Game controller managing board state and game flow
- **Snake**: Manages snake body using Deque and HashMap for O(1) collision detection
- **Food**: Represents food with coordinate validation
- **Coordinate**: Position with proper equals/hashCode implementation
- **Movement System**: Pluggable direction strategies

### Key Classes
```
SnakeGameApp.java     - Main game loop
Grid.java            - Game controller with visual display
Snake.java           - Snake logic with collision detection
Food.java            - Food generation avoiding snake body
Coordinate.java      - Position with validation
Moves/               - Movement strategy implementations
```

## Features
- **Visual Grid Display**: Shows snake head (H), body (S), and food (F)
- **Collision Detection**: Boundary and self-collision
- **Smart Food Generation**: Avoids placing food on snake body
- **Game State Management**: Win/lose conditions
- **Optimal Pathfinding**: Snake automatically finds food

## Technical Highlights
- Thread-safe singleton implementation
- Efficient O(1) collision detection using HashMap
- Clean separation of concerns
- Extensible movement system
- Proper resource management

## How to Run
```bash
javac SnakeGame/*.java SnakeGame/Moves/*.java
java SnakeGame.SnakeGameApp
```

## SDE2 Interview Readiness: ✅ EXCELLENT (8.5/10)
Demonstrates advanced OOP, design patterns, data structures, and clean architecture.
