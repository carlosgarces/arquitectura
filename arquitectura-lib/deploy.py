print '*** WEBLOGIC : START ***'
print 'connecting to admin server....'
connect( 'weblogic', 'Qwerty123', 't3://localhost:7001', adminServerName='AdminServer' )

if sys.argv[1] == 'true':
	print 'stopping and undeploying ....'
	stopApplication('arquitectura-lib')
	undeploy ('arquitectura-lib')
	
print 'deploying....'
deploy(appName='arquitectura-lib', path='app/target/arquitectura-lib-APP-0.0.1.ear', targets='AdminServer', libraryModule='true')
startApplication('arquitectura-lib')
print 'disconnecting from admin server....'
disconnect()
exit()
print '*** WEBLOGIC : STOP ***'