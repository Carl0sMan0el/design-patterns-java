# Explorando Padrões de Projetos na Prática com Java

Projeto com exemplos de três padrões de projeto clássicos, usando **Java 21** e estrutura **Maven** para facilitar uso no VS Code:

- Singleton
- Strategy
- Facade

## Como executar

### Usando Maven
```bash
mvn -q clean compile exec:java -Dexec.mainClass="br.com.carlos.patterns.App"
```

### Estrutura
```
src/
 └── main/java/br/com/carlos/patterns
      ├── App.java
      ├── singleton/ConfigManager.java
      ├── strategy/*.java
      └── facade/*.java
```

---
Compatível com Java 21 LTS.
