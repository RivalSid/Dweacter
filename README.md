# Dweacter Bot

**Dweacter** is a lightweight Discord bot written in **Java** using the **JDA (Java Discord API)** library.  
It is designed to track user interactions and reward quick reactions on a selected channel, following clean architecture principles and maintainable code structure.

---

## What it does

Dweacter monitors a chosen text channel and occasionally reacts to new messages with a configurable emoji.

When Dweacter reacts:
- The first user to react with the same emoji earns **5 points**
- The second earns **3 points**
- The third earns **1 point**

The bot keeps a persistent leaderboard of scores for:
- Lifetime totals
- Yearly, monthly, weekly, and daily rankings

Users (or admins) can view the leaderboard through commands, and admins can manage the emoji configuration and tracked channel.

---

## Running locally

### 1. Prerequisites
- Java 21
- Maven
- Internet access (to connect to Discord’s API)
- A Discord bot token

> To obtain the environment variable (`DISCORD_TOKEN`), please contact **Sid** directly.

### 2. Set the environment variable

**Windows PowerShell**
```powershell
$env:DISCORD_TOKEN="your_token_here"
```

**Linux / macOS**
```bash
export DISCORD_TOKEN="your_token_here"
```

### 3. Build and run

Using Maven Exec:
```bash
mvn clean compile exec:java -Dexec.mainClass="fr.dwunivers.DweacterApp"
```

Or run `DweacterApp.main()` from your IDE (for example, IntelliJ IDEA) with `DISCORD_TOKEN` set in the Run Configuration’s environment.

---

## Tech Stack

- Java 21
- Maven
- JDA 5 (Java Discord API)
- SLF4J + Logback for logging
- Clean, modular architecture (services, listeners, configuration, constants)

---

## Author

**Sid Arifi** — Backend Developer Apprentice  
Built in **Java**, with a lot of love for clean architecture.
