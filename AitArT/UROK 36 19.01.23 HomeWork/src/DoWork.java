public interface DoWork {

        String taskMsg(String status);
        String doWork(String taskMsg);
        void setAvailable();
        void setNotAvailable();
       void setBusy();

}
