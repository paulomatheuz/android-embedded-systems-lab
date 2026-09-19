#include <stdio.h>
#include <stdint.h>
#include <assert.h>

int byte_inicial_valido(uint8_t byte_inicial) 
{
    if (byte_inicial == 0xAA) {
        return 1;
    } else {
        return 0;
    }

}


int main(void)
{
    assert(byte_inicial_valido(0xAA) == 1);
    assert(byte_inicial_valido(0xAB) == 0);

    uint8_t pacote[] = {0xAA, 0x01, 0x17, 0x64, 0xD8};

    printf("%02X %02X\n", (unsigned) pacote[0], (unsigned) pacote[4]);

    if (byte_inicial_valido(pacote[0])) {
        printf("Byte inicial valido!\n");

        uint8_t checksum_recebido = pacote[4];
        uint8_t checksum_calculado = pacote[0] ^ pacote[1] ^ pacote[2] ^ pacote[3];

        printf("Checksum recebido: %02X\n", (unsigned) checksum_recebido);
        printf("Checksum calculado: %02X\n", (unsigned) checksum_calculado);

        if (checksum_recebido == checksum_calculado) {
            printf("Checksum valido!\n");

            uint8_t tipo_sensor = pacote[1];
            uint8_t temperatura = pacote[2];
            uint8_t bateria = pacote[3];

            printf("Tipo do sensor: %u\n", (unsigned) tipo_sensor);
            printf("Temperatura: %u\n", (unsigned) temperatura);
            printf("Bateria: %u\n", (unsigned) bateria);
        } else {
            printf("Checksum invalido!\n");
        }
    } else {
        printf("Pacote invalido!\n");
    }

    return 0;
}