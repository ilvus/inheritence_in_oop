# Device Management System

This Java project demonstrates inheritance and object-oriented programming principles by creating a base class (`Device`) and three derived classes (`Smartphone`, `Laptop`, `Tablet`) to model different types of devices.

## Table of Contents
- [Project Structure](#project-structure)
- [Classes Overview](#classes-overview)
- [How to Use](#how-to-use)
- [Example Usage](#example-usage)
- [Grading Criteria](#grading-criteria)
- [Contributing](#contributing)
- [License](#license)

## Project Structure
- `src/`
  - `Device.java` - Contains the base class `Device`.
  - `Smartphone.java` - Contains the derived class `Smartphone`.
  - `Laptop.java` - Contains the derived class `Laptop`.
  - `Tablet.java` - Contains the derived class `Tablet`.
  - `Main.java` - Main program to demonstrate the project.

## Classes Overview

### Device
- Represents a general device with attributes `type`, `price`, and `weight`.
- Provides methods for getting and setting these attributes.

### Smartphone
- Extends `Device` class.
- Adds attributes `screenSize` and `cameraResolution`.
- Provides methods for getting and setting these attributes.

### Laptop
- Extends `Device` class.
- Adds attributes `processor` and `ram`.
- Provides methods for getting and setting these attributes.

### Tablet
- Extends `Device` class.
- Adds attribute `isPortable`.
- Provides methods for getting and setting this attribute.

## How to Use

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Run the `Main.java` file.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        // ... (example usage code)
    }
}
