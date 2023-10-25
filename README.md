# makejavarusty
#MashaKatharina//Projekt
#coprojekt bodybuildinggenerator for sublements

# Proteinberechnungsanwendung

Dies ist eine Anwendung, die mithilfe von Körpergewicht, Körpergröße und Geschlecht die benötigte Eiweißmenge pro Tag berechnet. Sie besteht aus einem Rust-basierten Backend, das die Berechnungen durchführt, und einer Java-GUI für die Benutzereingabe und Anzeige der Ergebnisse.

## Anforderungen

- Rust (Version XYZ)
- Java (Version ABC)

## Installation

1. Klone Sie das Repository:

   ```shell
   git clone https://github.com/yourusername/protein-calculator.git
   cd protein-calculator
   
# start backend
cd backend
cargo run

# startgui
cd gui
javac Main.java
java Main

# Verwendung
Starten Sie die Anwendung, wie oben beschrieben.
Geben Sie Ihr Körpergewicht, Ihre Körpergröße und Ihr Geschlecht in der GUI ein.
Klicken Sie auf den „Berechnen“-Button, um die benötigte Eiweißmenge pro Tag zu berechnen.
Das Ergebnis wird in der GUI angezeigt.
Kommunikation zwischen Rust und Java
Die Anwendung verwendet eine einfache Socket-Verbindung für die Kommunikation zwischen Rust und Java. Bitte stellen Sie sicher, dass die beiden Teile der Anwendung zur richtigen Zeit gestartet werden, um die Kommunikation zu ermöglichen.

# Lizenz
Dieses Projekt ist unter der MIT-Lizenz lizenziert. 

# Autoren
Masha Katharina


# Protein Calculator
Dieses Projekt enthält Implementierungen eines Proteinrechners in Java und Rust. Der Rechner berechnet die empfohlene tägliche Eiweißmenge basierend auf dem Gewicht, dem Geschlecht und der Körpergröße einer Person.

# Java Version
Die Java-Version des Proteinrechners verwendet Swing für eine einfache GUI (Grafische Benutzeroberfläche). Das Programm bietet die folgenden Funktionen:

Eingabe des Körpergewichts in Kilogramm

Geben Sie das Körpergewicht der Person in Kilogramm ein. Das Gewicht muss eine positive Zahl sein.
Eingabe des Geschlechts (male/female)

Wählen Sie das Geschlecht der Person aus, indem Sie "male" für Männer oder "female" für Frauen eingeben.
Eingabe der Körpergröße in Zentimetern

Geben Sie die Körpergröße der Person in Zentimetern ein.
Berechnung der empfohlenen täglichen Eiweißmenge

Klicken Sie auf die Schaltfläche "Berechnen", um die empfohlene tägliche Eiweißmenge basierend auf den eingegebenen Informationen zu erhalten.
Anzeige von Validierungsnachrichten bei ungültigen Eingaben

Das Programm überprüft die Eingaben auf Gültigkeit und zeigt Fehlermeldungen an, wenn ungültige Werte eingegeben werden.
Löschen der Eingabefelder

Mit der Schaltfläche "Löschen" können Sie alle Eingabefelder zurücksetzen.
Verwendung der Java-Version
Führen Sie die ProteinCalculator.java-Datei aus, um die GUI-Anwendung zu starten. Geben Sie die erforderlichen Informationen ein und klicken Sie auf die Schaltfläche "Berechnen", um die empfohlene tägliche Eiweißmenge zu erhalten.

# Rust Version
Die Rust-Version des Proteinrechners ist eine Konsolenanwendung. Das Programm bietet die folgenden Funktionen:

Eingabe des Körpergewichts in Kilogramm

Geben Sie das Körpergewicht der Person in Kilogramm ein. Das Gewicht muss eine positive Zahl sein.
Eingabe des Geschlechts (male/female)

Wählen Sie das Geschlecht der Person aus, indem Sie "male" für Männer oder "female" für Frauen eingeben.
Eingabe der Körpergröße in Zentimetern

Geben Sie die Körpergröße der Person in Zentimetern ein.
Berechnung der empfohlenen täglichen Eiweißmenge

Das Programm berechnet die empfohlene tägliche Eiweißmenge basierend auf den eingegebenen Informationen, wobei der Grundbedarf und zusätzliche Anpassungen für die Größe berücksichtigt werden.
Endlosschleife, um mehrere Berechnungen durchzuführen

Das Programm bietet die Möglichkeit, mehrere Berechnungen hintereinander durchzuführen, ohne das Programm erneut zu starten.
Verwendung der Rust-Version
Führen Sie die main.rs-Datei aus, um die Konsolenanwendung zu starten. Geben Sie die erforderlichen Informationen ein, und das Programm gibt die empfohlene tägliche Eiweißmenge aus. Das Programm wird weiterhin nach neuen Eingaben fragen, bis es manuell beendet wird.

