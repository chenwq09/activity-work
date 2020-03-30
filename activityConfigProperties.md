#activity 配置文件属性：
1.spring.activiti.database-schema-update

spring.activiti.database-schema-update=true

databaseSchemaUpdate配置项可以设置流程引擎启动和关闭时数据库执行的策略。 databaseSchemaUpdate有以下四个值：

false：false为默认值，设置为该值后，Activiti在启动时，会对比数据库表中保存的版本，如果版本不匹配时，将在启动时抛出异常。

true：设置为该值后，Activiti会对数据库中所有的表进行更新，如果表不存在，则Activiti会自动创建。

create-drop：Activiti启动时，会执行数据库表的创建操作，在Activiti关闭时，执行数据库表的删除操作。

drop-create：Activiti启动时，执行数据库表的删除操作在Activiti关闭时，会执行数据库表的创建操作。

设置为true后启动应用，会在数据库里创建28张表，表创建好之后停止应用，设置为false，每次应用启动不检查Activiti数据表是否存在及版本号是否匹配，以提升应用启动速度。
#2.spring.activiti.history-level
保存历史数据级别设置为full最高级别，便于历史数据的追溯

spring.activiti.history-level=full

对于历史数据，保存到何种粒度，Activiti提供了history-level属性对其进行配置。history-level属性有点像log4j的日志输出级别，该属性有以下四个值：

none：不保存任何的历史数据，因此，在流程执行过程中，这是最高效的。

activity：级别高于none，保存流程实例与流程行为，其他数据不保存。

audit：除activity级别会保存的数据外，还会保存全部的流程任务及其属性。audit为history的默认值。

full：保存历史数据的最高级别，除了会保存audit级别的数据外，还会保存其他全部流程相关的细节数据，包括一些流程参数等。

#3.spring.activiti.check-process-definitions
关闭activiti自动部署（使用流程设计器部署，不使用具体文件访问方式）
spring.activiti.check-process-definitions=false
在src/main/java/resources目录下新建processes目录，并在该目录下新增一个业务流程文件(默认以.bpmn20.xml或.bpmn为后缀名)（activity默认校验resources下的processes文件夹里的流程文件，如果没有processes目录并且目录下没有流程文件会报错class path resource [processes/] cannot be resolved to URL because it does not exist），
可以在配置文件中配置spring.activiti.check-process-definitions=false，设置为不校验，这样就不会报错。