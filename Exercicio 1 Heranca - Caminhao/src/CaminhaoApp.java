import java.util.ArrayList;
import java.util.List;

public class CaminhaoApp {
    public static void main(String[] args) {
        List<CaminhaoBau> caminhaoBaus = new ArrayList<>();
        List<CaminhaoTanque> caminhaoTanques = new ArrayList<>();

        caminhaoBaus.add(
                new CaminhaoBau("Volvo 123",
                        2020,
                        2000,
                        'T',
                        10,
                        2.2,
                        3.5)
        );

        caminhaoBaus.add(
                new CaminhaoBau("WV Turbo",
                        2021,
                        1800,
                        'T',
                        12,
                        2.2,
                        3.5)
        );

        caminhaoBaus.add(
                new CaminhaoBau("WV T1000",
                        2022,
                        2200,
                        'T',
                        14,
                        2.2,
                        3.8)
        );

        caminhaoTanques.add(
                new CaminhaoTanque("Iveco Day",
                        2019,
                        3000,
                        'L',
                        "Água")
        );

        caminhaoTanques.add(
                new CaminhaoTanque("MB 2000",
                        2021,
                        2500,
                        'L',
                        "Combustível")
        );

        /* caminhaoBaus.forEach(
                c -> System.out.printf("Modelo: %s, Ano de Fabricação: %d, Capacidade total: %d%c, Volume: %.2f\n",
                        c.getModelo(), c.getAnoFabricacao(), c.getCapacidadeTotal(), c.getUnidade(), c.getVolume())
        );

        caminhaoTanques.forEach(
                c -> System.out.printf("Modelo: %s, Ano de Fabricação: %d, Capacidade total: %d%c, Tipo: %s\n",
                        c.getModelo(), c.getAnoFabricacao(), c.getCapacidadeTotal(), c.getUnidade(), c.getTipo())
        ); */
    }
}
