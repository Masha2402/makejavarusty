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




