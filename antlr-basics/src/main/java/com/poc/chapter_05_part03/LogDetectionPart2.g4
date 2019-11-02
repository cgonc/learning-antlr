grammar LogDetectionPart2;

file : row+ ; // parser rule matching rows of log file
row : IP STRING INT NL ; // match log file record

IP : INT '.' INT '.' INT '.' INT ; // 192.168.209.85
INT : [0-9]+ ; // match IP octet or HTTP result code
STRING: '"' .*? '"' ; // matches the HTTP protocol command
NL : '\n' ; // match log file record terminator
WS : ' ' -> skip ; // ignore spaces