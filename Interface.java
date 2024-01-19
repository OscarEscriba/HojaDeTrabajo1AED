public interface Interface {
    int AM = 0;
    int FM = 1;

    void encender();

    void apagar();

    void setVolume(int i);

    void cambiarBanda(int banda);

    void subirEmisora();

    void bajarEmisora();

    void guardarEmisora(int i, float frec);

    void seleccionarEmisora(int i);

    float getEmisora();

    int getVolumen();

    int getBanda();
}
