package projectservice

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("When a POST request with a Project is made, the created project is returned")
    request {
        method 'GET'
        url '/projects/1'
    }
    response {
        status 200
        body(
                id: 1,
                projectName: "Test Project",
                description: "Test Project Description",
                startDate: null,
                endDate: null

        )
        headers {
            contentType(applicationJson())
        }
    }
}