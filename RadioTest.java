import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class RadioTest {
    @Test
    public void testCambiarFrecuencia() {
        RadioAMFM radio = new RadioAMFM();

        // Al cambiar la frecuencia, debería ser diferente a la frecuencia inicial
        radio.cambiarFrecuencia();

        assertNotEquals(530, radio.getFrecuencia());
    }

    @Test
    public void testAvanzarDial() {
        RadioAMFM radio = new RadioAMFM();
        int frecuenciaInicial = radio.getFrecuencia();

        // Al avanzar el dial, la frecuencia debería cambiar
        radio.avanzarDial();

        assertNotEquals(frecuenciaInicial, radio.getFrecuencia());
        //frecuencia
    }

    @Test
    public void testGetFrecuencia() {
        RadioAMFM radio = new RadioAMFM();

        // La frecuencia inicial debería ser 530
        assertEquals(530, radio.getFrecuencia());
    }
}
