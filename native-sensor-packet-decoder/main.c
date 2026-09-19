#include <stdio.h>
#include <stdint.h>

int main(void)
{
    uint8_t pacote[] = {0xAA, 0x01, 0x17, 0x64, 0xD8};

    printf("%02X %02X\n", (unsigned) pacote[0], (unsigned) pacote[4]);

    if (pacote[0] == 0xAA) {
        printf("Pacote valido!\n");

        uint8_t tipo_sensor = pacote[1];
        uint8_t temperatura = pacote[2];
        uint8_t bateria = pacote[3];

        printf("Tipo do sensor: %u\n", (unsigned) tipo_sensor);
        printf("Temperatura: %u\n", (unsigned) temperatura);
        printf("Bateria: %u\n", (unsigned) bateria);

    } else {
        printf("Pacote invalido!\n");
    }

    return 0;
}