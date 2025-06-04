 class FileDownload extends  Thread{
    String fileName;

    public FileDownload(String fileName) {
        this.fileName=fileName;
    }
      public  void run(){
        for(int i=1;i<=5;i++){
                   System.out.println(fileName +" " +"dowloding..." + (i*20) + "%");
                   try {
                       Thread.sleep(2000);
                   } catch (Exception e) {
                   }
        }
        System.out.println(fileName + "doneeeeee");
      }
     
}

class Multithread4{
    public static void main(String[] args) {
        FileDownload t1= new FileDownload("File A");
        FileDownload t2= new FileDownload("File B");
        t1.start();
        t2.start();

        
    }
}


     
