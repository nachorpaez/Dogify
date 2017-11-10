echo
curl -H "Content-Type: application/json" -X GET -d '{}' localhost:8080/tarifador/confirmar/cliente/test
echo
echo

echo
curl -H "Content-Type: application/json" -X GET -d '{}' localhost:8080/tarifador/confirmar/cliente
echo
echo