# Kafka Streams & Spring Cloud Stream

## 📋 Description

Application de traitement de flux de données en temps réel avec Apache Kafka et Spring Cloud Stream.

## 🏗️ Architecture

```
REST API (Producer) ──► Kafka ──► Stream Analytics ──► Web Dashboard
                          ▲              │
                          │              ▼
                     Supplier        Consumer
```

## 🚀 Technologies

- **Apache Kafka** - Streaming distribué
- **Spring Cloud Stream** - Intégration Kafka
- **Kafka Streams** - Traitement temps réel
- **Docker Compose** - Kafka + Zookeeper

## 📦 Composants

1. **Producer Service** - REST API pour publier des messages
2. **Consumer Service** - Consomme les messages Kafka
3. **Supplier Service** - Génère automatiquement des données
4. **Stream Analytics** - Traitement temps réel (agrégations, filtrage)
5. **Web Dashboard** - Visualisation temps réel des résultats

## 🛠️ Installation

```bash
# Démarrer Kafka et Zookeeper
docker-compose up -d

# Démarrer l'application
mvn spring-boot:run
```

## 🧪 Tests

**Producer via REST :**
```bash
curl -X POST http://localhost:8080/api/produce \
  -H "Content-Type: application/json" \
  -d '{"data": "Hello Kafka"}'
```

**Kafka Console Producer :**
```bash
docker exec -it <kafka-container> kafka-console-producer \
  --bootstrap-server localhost:9092 --topic test-topic
```

**Kafka Console Consumer :**
```bash
docker exec -it <kafka-container> kafka-console-consumer \
  --bootstrap-server localhost:9092 --topic test-topic --from-beginning
```

## 🌐 URLs

| Service | URL |
|---------|-----|
| Application | http://localhost:8080 |
| Dashboard | http://localhost:8080/dashboard |

## 🎯 Fonctionnalités

✅ Configuration Kafka avec Docker  
✅ Producer REST Controller  
✅ Consumer & Supplier Kafka  
✅ Stream Analytics (Kafka Streams)  
✅ Dashboard Web temps réel  
✅ Tests kafka-console  
