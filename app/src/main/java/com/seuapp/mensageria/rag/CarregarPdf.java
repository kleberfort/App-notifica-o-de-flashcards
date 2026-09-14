package com.seuapp.mensageria.rag;

import android.content.Context;

import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.text.PDFTextStripper;

import java.io.InputStream;


public class CarregarPdf {

    private final Context context;

    //context - representa Acesso ao ambiente da Aplicação: arquivos, assets, recursos, serviços do android, ou seja minha classe
    //vai ter acesso
    public CarregarPdf(Context context) {
        this.context = context.getApplicationContext();

        //Inicialize os recursos necessários do PDFBox para funcionar no Android.
        PDFBoxResourceLoader.init(context);
    }

    public String extrairTexto(String nomeArquivo) throws Exception {

        //context.getAssets() = Quero acessar a pasta assets da minha aplicação.

        //InputStream inputStream = cria um fluxo de leitura e permite que o programa leia os dados do arquivo.
        InputStream inputStream = context.getAssets().open("rag/pdf/" + nomeArquivo);
        // PDDocument documento = PDDocument.load(inputStream); = carrega o PDF e interpreta, vai saber todas as páginas
        PDDocument documento = PDDocument.load(inputStream);

        try {

            //PDFTextStripper stripper = new PDFTextStripper(); = extrai texto das páginas
            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(documento);
        } finally {
            // Antes de Finalizar o finally é executado, utilizado para fechar o documento pdf para não ocupar recursos e o fluxo de ler o arquivo.
            documento.close();
            inputStream.close();
        }
    }
}