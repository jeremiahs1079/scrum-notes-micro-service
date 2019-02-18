package projectservice

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("When a POST request with a Project is made, the created project is returned")
    request {
        method 'POST'
        url '/projects/add'
        body(
                projectName: "Test Project"
        )
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 201
        body(
                id: 1,
                projectName: "Test Project"
        )
        headers {
            contentType(applicationJson())
        }
    }
}