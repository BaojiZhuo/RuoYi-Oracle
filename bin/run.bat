@echo off
echo.
echo [��Ϣ] ʹ��Jar��������Web���̡�
echo.

cd %~dp0
cd ../ruoyi-admin/target

set JAVA_OPTS=-Xms256m -Xmx2048m -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=1024m

java -jar %JAVA_OPTS% ruoyi-admin.jar

cd bin
pause