package register;


import document.Document;

public class Register {

    private Document[] documents = new Document[10];

    public Register(){}

    public void saveDocument(Document document) {
        for(int i = 0; i < documents.length; i++){
            if(documents[i] == null){
                documents[i] = document;
                break;
            }
            if(i == documents.length - 1){
                System.out.println("Нет места");
            }
        }
    }

    public void getDocumentInfo(String documentNumber){
        for (int i = 0; i < documents.length; i++){
            if(documents[i] != null && documents[i].getDocumentNumber().equals(documentNumber)) {
                System.out.println(documents[i]);
                break;
            }
            if(documents[i] == null || i == documents.length - 1) {
                System.out.println("Документ не найден");
                break;
            }
        }
    }
}
