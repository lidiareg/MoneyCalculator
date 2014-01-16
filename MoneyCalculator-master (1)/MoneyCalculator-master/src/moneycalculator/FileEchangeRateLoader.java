package moneycalculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

class FileExchangeRateLoader implements ExchangeRateLoader {
    private File archivo;
    private String url;

    /**
     * Constructor con la dirección url del fichero
     *
     * @param url
     */
    public FileExchangeRateLoader(String url) {
        this.url = url;
    }

    /**
     * Constructor con parámetro File
     *
     * @param archivo
     */
    public FileExchangeRateLoader(File archivo) {
        this.archivo = archivo;
    }

    /**
     * Carga todos los ExchangeRate dentro del fichero con el que se creó el
     * FileExchangeRateLoader
     *
     * @return
     */
    @Override
    public ExchangeRate[] load() {
        FileReader fr;
        ExchangeRate[] result = null;
        try {
            archivo = new File("url");
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String[] linea = br.readLine().split(" ");
            ArrayList<ExchangeRate> lista = new ArrayList<ExchangeRate>();
            while (linea != null) {
                ExchangeRate actual = new ExchangeRate(linea[0], Float.parseFloat(linea[1]), linea[2]);
                lista.add(actual);
                linea = br.readLine().split(" ");
            }
            result = new ExchangeRate[lista.size()];
            int n = 0;
            for (ExchangeRate exchangeRate : lista) {
                result[n++] = exchangeRate;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

