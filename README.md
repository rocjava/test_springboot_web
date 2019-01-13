springboot
add web
spring-boot-starter-web

add jsp
spring-boot-starter-tomcat
tomcat-embed-jasper
jstl
----------------------------------------
About springboot project hot deploy
3 steps get it!
1:setting idea compiler automake project
2:import maven dependency
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<optional>true</optional>
			<scope>true</scope>
		</dependency>
3:Ctrl+Shift+Alt+"/" 
registry 
compiler.automake.allow.when.app.running		
----------------------------------------
About webapp and static resources
add webapp catagory to classpath
1:File-->Project Structure-->"+"-->"WEB"
edit the web resource directories to
E:\test_project\test_springboot_dubbo\src\main\webapp
2:edit pom.xml between <build></build> tag
		<resources>
			<resource>
				<directory>src/main/webapp</directory>
				<targetPath>META-INF/resources</targetPath>
				<includes>
					<include>**/**</include>
				</includes>
			</resource>
			<resource>
				<directory>src/main/resources</directory>
				<filtering>true</filtering>
				<includes>
					<include>**/*</include>
				</includes>
			</resource>
		</resources>

