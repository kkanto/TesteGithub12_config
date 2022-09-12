 
listView('TesteGithub12 Jobs') {
    description('TesteGithub12 Jobs')
    jobs {
        regex('TesteGithub12_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
