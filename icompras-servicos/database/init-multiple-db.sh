#!/bin/bash
set -e

# Lista de bancos que você quer criar
for db in icomprasclientes icomprasprodutos icompraspedidos; do
  echo "📦 Criando banco: $db"
  psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE DATABASE $db;
EOSQL
done
