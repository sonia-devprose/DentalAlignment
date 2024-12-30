# Dental Aligner: Intelligent Treatment Plan Generator 🦷  

The **Dental Aligner** project simulates a software system used by dental professionals to detect and manage bite-related conditions such as **overbite** and **underbite**. The program determines the severity of the condition and provides customized treatment plans, such as **Invisalign aligners**, **retainers**, or **braces**.

## Key Features 🚀  
1. **Inheritance-Based Design**:  
   - A base class, `DentalCondition`, encapsulates general attributes and methods.  
   - Specialized subclasses, `OverbiteCondition` and `UnderbiteCondition`, extend `DentalCondition` to provide condition-specific logic.

2. **Condition Detection**:  
   - Detects bite severity levels such as *Normal*, *Mild*, *Moderate*, and *Severe* based on the severity score.  

3. **Treatment Recommendations**:  
   - Generates actionable treatment plans tailored to the detected severity level.  
   - Includes options like **aligners**, **retainers**, and advanced treatments such as **tooth extraction**.

4. **Extensible Architecture**:  
   - Easily extendable to include additional bite conditions or other dental anomalies.  

## How It Works ⚙️  
1. **Base Class - `DentalCondition`**:  
   - Holds patient information, severity level, and general treatment methods.  
   - Provides a blueprint for specific conditions like overbite or underbite.  

2. **Subclasses - `OverbiteCondition` and `UnderbiteCondition`**:  
   - Override methods to implement condition-specific detection and treatment logic.  

3. **Execution**:  
   - The `main()` method in `DentalAligner` creates and processes patient cases, displaying treatment plans in the console.  

## Sample Output 📋  
```text
John Doe - an overbite condition; Mild overbite  
Invisalign aligners recommended  

Tiffany - an underbite condition; Moderate underbite  
Invisalign with retainers and OPR recommended  

Stuart - an overbite condition; Severe overbite  
Braces with tooth extraction required.  
```

## Code Highlights 🖋️  
- **Encapsulation and Inheritance**: Demonstrates the use of `protected` attributes and method overriding.  
- **Polymorphism**: Leverages the base class reference for dynamically invoking subclass-specific implementations.  
- **Switch Statements**: Implements branching logic for clear and maintainable treatment rules.  

## Future Enhancements 🔮  
1. Add additional conditions (e.g., crossbite, open bite).  
2. Integrate with 3D scanning and simulation APIs to detect measurements.  
3. Implement a graphical user interface for better visualization.  

![Screenshot 2024-12-31 015817](https://github.com/user-attachments/assets/b290c0bb-9052-4a15-8601-f4bc76f0940e)

---
