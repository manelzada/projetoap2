mkdir bin\assets
javac --module-path E:\Users\jonat\Downloads\javafx-sdk-11.0.2\lib --add-modules javafx.controls,javafx.fxml -d bin visao\*.java
javac --module-path E:\Users\jonat\Downloads\javafx-sdk-11.0.2\lib --add-modules javafx.controls,javafx.fxml -d bin login\*.java
javac --module-path E:\Users\jonat\Downloads\javafx-sdk-11.0.2\lib --add-modules javafx.controls,javafx.fxml -d bin modelo\*.java
javac --module-path E:\Users\jonat\Downloads\javafx-sdk-11.0.2\lib --add-modules javafx.controls,javafx.fxml -d bin Controle\*.java
Copy login\*.fxml bin\login
Copy visao\*.fxml bin\visao
Copy assets\*.jpg bin\assets
cd bin
java --module-path E:\Users\jonat\Downloads\javafx-sdk-11.0.2\lib --add-modules javafx.controls,javafx.fxml visao.AppBiblioteca