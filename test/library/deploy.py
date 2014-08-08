print '*** WEBLOGIC : START ***'
print 'connecting to admin server....'
connect( 'weblogic', 'Qwerty123', 't3://localhost:7001', adminServerName='AdminServer' )

if sys.argv[1] == 'true':
	print 'stopping and undeploying ....'
	stopApplication('library-APP')
	undeploy ('library-APP')
	
	
print 'deploying....'
deploy(appName='library-APP', path='app/target/library-APP-0.0.1.ear', targets='AdminServer')
startApplication('library-APP')
print 'disconnecting from admin server....'
disconnect()
exit()
print '*** WEBLOGIC : STOP ***'