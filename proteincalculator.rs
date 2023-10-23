use std::io;

fn calculate_protein(weight: f64, height: f64, gender: &str) -> f64 {
    // Hier können Sie Ihre Proteinberechnungslogik implementieren
    // Zum Beispiel: if gender == "male" { ... } else { ... }
    // Dies ist ein Platzhalter für die eigentliche Berechnung
    return weight * 0.8; // Beispielberechnung
}

fn main() {
    println!("Rust Protein Calculator");

    loop {
        println!("Bitte geben Sie das Körpergewicht (kg) ein:");
        let mut weight = String::new();
        io::stdin().read_line(&mut weight).expect("Fehler beim Einlesen des Gewichts");
        let weight: f64 = match weight.trim().parse() {
            Ok(num) => num,
            Err(_) => {
                println!("Ungültige Eingabe. Bitte geben Sie eine positive Zahl ein.");
                continue;
            }
        };

        println!("Bitte geben Sie die Körpergröße (cm) ein:");
        let mut height = String::new();
        io::stdin().read_line(&mut height).expect("Fehler beim Einlesen der Größe");
        let height: f64 = match height.trim().parse() {
            Ok(num) => num,
            Err(_) => {
                println!("Ungültige Eingabe. Bitte geben Sie eine positive Zahl ein.");
                continue;
            }
        };

        println!("Bitte geben Sie das Geschlecht ein (male/female):");
        let mut gender = String::new();
        io::stdin().read_line(&mut gender).expect("Fehler beim Einlesen des Geschlechts");
        let gender = gender.trim();

        let protein = calculate_protein(weight, height, gender);
        println!("Die benötigte Eiweißmenge pro Tag beträgt: {} g", protein);
    }
}
