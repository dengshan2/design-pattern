package DatePackage;

/**
 * Created by WangKe on 2014/10/17.
 * Modified by ZD
 */
public class LogFileInfo {
    private String m_filename;
    private long m_last_modification_time;
    private int m_file_index_num;

    public LogFileInfo() {
    }

    public  String getFilename() {
        return m_filename;
    }
    public  long getmtime()    {return m_last_modification_time;}
    public  int getFileIndexNum()
    {
        return m_file_index_num;
    }
    public void setFilename(String filename)
    {
        m_filename = filename;
    }
    public void setLastModificationTime(long last_change_time)
    {
        m_last_modification_time = last_change_time;
    }
    public void setFileIndexNum(int num)
    {
        m_file_index_num = num;
    }

}
