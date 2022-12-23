# CurrencyConvertorWebService
Soap webservice server side for the currency conversion.

Run the CurrencyConversionWs.java file to start the web service

paste this link in your browser to access to the wsdl file http://localhost:8888/CurrencyConversionService?wsdl

Run this to generate the client stub folder in intellij terminal change the jdk path to your machine appropriately. [wsimport.exe directory] -keep -d [directory that you want to generate the codes] -p [package name] [url for wsdl file]

"C:\Program Files\Java\zulu8.66.0.15-ca-jdk8.0.352-win_x64\bin\wsimport.exe" -keep -d . -p com.sltc.soa.client.stub http://localhost:8888/CurrencyConversionService?wsdl

copy the stub folder that contain ll the classes and files of the web service to the com.sltc.soa.client package in the CurrencyConversionWebServiceClient folder.

Finally, copy the stub folder to the com.sltc.soa.client package.
