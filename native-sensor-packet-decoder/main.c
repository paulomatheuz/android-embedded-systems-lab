#include <stdio.h>
#include <stdint.h>

int main(void)
{
    uint8_t pacote[] = {0xAA, 0x01, 0x17, 0x64, 0xD8};
	printf("%02X %02X\n", (unsigned) pacote[0], (unsigned) pacote[4]);

    return 0;
}