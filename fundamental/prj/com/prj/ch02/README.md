2. Notepad 만들기
================
# 1. File Class
- java.io
- IOException

# 2. IO Stream
- 실제 하드웨어 장치와 상관없이 일관된 방법으로 입출력 데이터의 추상적인 표현이 가능
- Character Stream : 2bytes(16bits) 문자/문자열을 읽고 쓰기 위한 Stream
        - Object
            - Reader
                - InputStreamReader
                    - FileReader
                - BufferedReader
            - Writer
                - OutputStreamWriter
                    - FileWriter
                - BufferedWriter
                - PrintWriter
- Byte Stream : 1byte(8bit)를 읽고 쓰기 위한 Stream
        - Object
            - InputStream
                - FileInputStream
                - ObjectInputStream
                - FilterInputStream
                    - BufferedInputStream
                    - DataInputStream
            - OutputStream
                - FileOutputStream
                - ObjectOutStream
                - FilterOutputStream
                    - BufferedOutputStream
                    - DataOutputStream
                    - PrintStream


# 3. Encoding
- 문자열 값이 한글일 경우 알아볼 수 없는 문자열이 출력되는 경우 --> Encoding 문제이다
    - 프롬프트 : 8859_1로 인코딩된 데이터를 읽게되는데,
    - System.out.println() : KSC5601로 변환하여 출력하기 때문이다.
- Solution
    - 프롬프트에서 받아들인 입력을 getBytes("8859_1")로 읽어들여 "KSC5601" 방식의 문자열로 변환
    - ==> String str_name = new String(입력문자열.getBytes("8859_1"), "KSC5601");
